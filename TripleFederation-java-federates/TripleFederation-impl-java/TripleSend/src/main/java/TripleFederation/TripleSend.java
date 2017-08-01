package TripleFederation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.AdvanceTimeRequest;

/**
 * The TripleSend type of federate for the federation designed in WebGME.
 *
 */
public class TripleSend extends TripleSendBase {

    private final static Logger log = LogManager.getLogger(TripleSend.class);

    double currentTime = 0;

    ///////////////////////////////////////////////////////////////////////
    // TODO Instantiate objects that must be sent every logical time step
    //
     Obj3 vObj3 = new Obj3();
     Obj1 vObj1 = new Obj1();
     Obj2 vObj2 = new Obj2();
    //
    ///////////////////////////////////////////////////////////////////////

    public TripleSend(FederateConfig params) throws Exception {
        super(params);

        ///////////////////////////////////////////////////////////////////////
        // TODO Must register object instances after super(args)
        //
         vObj3.registerObject(getLRC());
         vObj1.registerObject(getLRC());
         vObj2.registerObject(getLRC());
        //
        ///////////////////////////////////////////////////////////////////////
    }

    private void execute() throws Exception {
        if(super.isLateJoiner()) {
            currentTime = super.getLBTS() - super.getLookAhead();
            super.disableTimeRegulation();
        }

        /////////////////////////////////////////////
        // TODO perform basic initialization below //
        /////////////////////////////////////////////

        AdvanceTimeRequest atr = new AdvanceTimeRequest(currentTime);
        putAdvanceTimeRequest(atr);

        if(!super.isLateJoiner()) {
            readyToPopulate();
        }

        ///////////////////////////////////////////////////////////////////////
        // Call CheckReceivedSubscriptions(<message>) here to receive
        // subscriptions published before the first time step.
        ///////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////////
        // TODO perform initialization that depends on other federates below //
        ///////////////////////////////////////////////////////////////////////

        if(!super.isLateJoiner()) {
            readyToRun();
        }

        startAdvanceTimeThread();

        // this is the exit condition of the following while loop
        // it is used to break the loop so that latejoiner federates can
        // notify the federation manager that they left the federation
        boolean exitCondition = false;

        while (true) {
            currentTime += super.getStepSize();

            atr.requestSyncStart();
            enteredTimeGrantedState();

            ////////////////////////////////////////////////////////////////////////////////////////
            // TODO send interactions that must be sent every logical time step below.
            // Set the interaction's parameters.
            //
                Int3 vInt3 = create_Int3();
                vInt3.set_boolVal(true);
                vInt3.set_intVal(789);
                vInt3.set_strVal("GHI");
                vInt3.sendInteraction(getLRC(), currentTime);
            
                Int1 vInt1 = create_Int1();
                vInt1.set_boolVal(true);
                vInt1.set_intVal(123);
                vInt1.set_strVal("ABC");
                vInt1.sendInteraction(getLRC(), currentTime);
            
                Int2 vInt2 = create_Int2();
                vInt2.set_boolVal(true);
                vInt2.set_intVal(456);
                vInt2.set_strVal("DEF");
                vInt2.sendInteraction(getLRC(), currentTime);
            //
            ////////////////////////////////////////////////////////////////////////////////////////

            ////////////////////////////////////////////////////////////////////////////////////////
            // TODO objects that must be sent every logical time step
            //
                vObj3.set_Obj3Attr1(true);
                vObj3.set_Obj3Attr2(789);
                vObj3.set_Obj3Attr3("GHI");
                vObj3.updateAttributeValues(getLRC(), currentTime);
            
                vObj1.set_Obj1Attr1(true);
                vObj1.set_Obj1Attr2(123);
                vObj1.set_Obj1Attr3("ABC");
                vObj1.updateAttributeValues(getLRC(), currentTime);
            
                vObj2.set_Obj2Attr1(true);
                vObj2.set_Obj2Attr2(456);
                vObj2.set_Obj2Attr3("DEF");
                vObj2.updateAttributeValues(getLRC(), currentTime);
            //
            //////////////////////////////////////////////////////////////////////////////////////////

            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            // DO NOT MODIFY FILE BEYOND THIS LINE
            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            AdvanceTimeRequest newATR = new AdvanceTimeRequest(currentTime);
            putAdvanceTimeRequest(newATR);
            atr.requestSyncEnd();
            atr = newATR;

            if(exitCondition) {
                break;
            }
        }

        // while loop finished, notify FederationManager about resign
        super.notifyFederationOfResign();
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            TripleSend federate = new TripleSend(federateConfig);
            federate.execute();

            System.exit(0);
        } catch (Exception e) {
            log.error("There was a problem executing the TripleSend federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
