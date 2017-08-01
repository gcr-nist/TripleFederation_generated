
package TripleFederation;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The Int1 class implements the Int1 interaction in the
* TripleFederation simulation.
*/
public class Int1 extends C2WInteractionRoot {

	private static final Logger logger = LogManager.getLogger(Int1.class);

	/**
	* Default constructor -- creates an instance of the Int1 interaction
	* class with default parameter values.
	*/
	public Int1() { }

	
	
	private static int _boolVal_handle;
	private static int _intVal_handle;
	private static int _strVal_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "boolVal" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "boolVal" parameter
	*/
	public static int get_boolVal_handle() { return _boolVal_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "intVal" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "intVal" parameter
	*/
	public static int get_intVal_handle() { return _intVal_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "strVal" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "strVal" parameter
	*/
	public static int get_strVal_handle() { return _strVal_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the Int1 interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the Int1
	* interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.Int1"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the Int1 interaction class.
	*/
	public static String get_simple_class_name() { return "Int1"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden parameters in the
	* Int1 interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return a set of parameter names pertaining to the reference,\
	* rather than the parameter names of the class for the instance referred to by
	* the reference.  For the polymorphic version of this method, use
	* {@link #getParameterNames()}.
	*/
	public static Set< String > get_parameter_names() {
		return new HashSet< String >(_datamemberNames);
	}


	/**
	* Returns a set containing the names of all of the parameters in the
	* Int1 interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return a set of parameter names pertaining to the reference,\
	* rather than the parameter names of the class for the instance referred to by
	* the reference.  For the polymorphic version of this method, use
	* {@link #getParameterNames()}.
	*/
	public static Set< String > get_all_parameter_names() {
		return new HashSet< String >(_allDatamemberNames);
	}


	

	static {
		_classNameSet.add("InteractionRoot.C2WInteractionRoot.Int1");
		_classNameClassMap.put("InteractionRoot.C2WInteractionRoot.Int1", Int1.class);
		
		_datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.Int1", _datamemberNames);
		_allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.Int1", _allDatamemberNames);

		
		
		
		_datamemberNames.add("boolVal");
		
		_datamemberNames.add("intVal");
		
		
		_datamemberNames.add("strVal");
		
		
		_allDatamemberNames.add("actualLogicalGenerationTime");
		_allDatamemberNames.add("boolVal");
		_allDatamemberNames.add("federateFilter");
		_allDatamemberNames.add("intVal");
		_allDatamemberNames.add("originFed");
		_allDatamemberNames.add("sourceFed");
		_allDatamemberNames.add("strVal");
		
		
		_datamemberTypeMap.put("boolVal", "boolean");
		_datamemberTypeMap.put("intVal", "int");
		_datamemberTypeMap.put("strVal", "String");
	
	

	}


	private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.Int1:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		C2WInteractionRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.Int1");
				isNotInitialized = false;
			} catch (FederateNotExecutionMember f) {
				logger.error("{} Federate Not Execution Member", initErrorMessage);
				logger.error(f);
				return;				
			} catch (NameNotFound n) {
				logger.error("{} Name Not Found", initErrorMessage);
				logger.error(n);
				return;				
			} catch (Exception e) {
				logger.error(e);
				CpswtUtils.sleepDefault();
			}
		}

		_classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.Int1", get_handle());
		_classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.Int1");
		_classHandleSimpleNameMap.put(get_handle(), "Int1");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_boolVal_handle = rti.getParameterHandle("boolVal", get_handle());			
				_intVal_handle = rti.getParameterHandle("intVal", get_handle());			
				_strVal_handle = rti.getParameterHandle("strVal", get_handle());
				isNotInitialized = false;
			} catch (FederateNotExecutionMember f) {
				logger.error("{} Federate Not Execution Member", initErrorMessage);
				logger.error(f);
				return;
			} catch (InteractionClassNotDefined i) {
				logger.error("{} Interaction Class Not Defined", initErrorMessage);
				logger.error(i);
				return;
			} catch (NameNotFound n) {
				logger.error("{} Name Not Found", initErrorMessage);
				logger.error(n);
				return;
			} catch (Exception e) {
				logger.error(e);
				CpswtUtils.sleepDefault();
			}
		}
			
			
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.Int1,boolVal", get_boolVal_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.Int1,intVal", get_intVal_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.Int1,strVal", get_strVal_handle());
			
			
		_datamemberHandleNameMap.put(get_boolVal_handle(), "boolVal");
		_datamemberHandleNameMap.put(get_intVal_handle(), "intVal");
		_datamemberHandleNameMap.put(get_strVal_handle(), "strVal");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.Int1:  could not publish:  ";

	/**
	* Publishes the Int1 interaction class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void publish(RTIambassador rti) {
		if (_isPublished) return;
		
		init(rti);

	

		synchronized(rti) {
			boolean isNotPublished = true;
			while(isNotPublished) {
				try {
					rti.publishInteractionClass(get_handle());
					isNotPublished = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", publishErrorMessage);
					logger.error(f);
					return;
				} catch (InteractionClassNotDefined i) {
					logger.error("{} Interaction Class Not Defined", publishErrorMessage);
					logger.error(i);
					return;
				} catch (Exception e) {
					logger.error(e);
					CpswtUtils.sleepDefault();
				}
			}
		}
		
		_isPublished = true;
	}

	private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.Int1:  could not unpublish:  ";
	/**
	* Unpublishes the Int1 interaction class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void unpublish(RTIambassador rti) {
		if (!_isPublished) return;
		
		init(rti);
		synchronized(rti) {
			boolean isNotUnpublished = true;
			while(isNotUnpublished) {
				try {
					rti.unpublishInteractionClass(get_handle());
					isNotUnpublished = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", unpublishErrorMessage);
					logger.error(f);
					return;
				} catch (InteractionClassNotDefined i) {
					logger.error("{} Interaction Class Not Defined", unpublishErrorMessage);
					logger.error(i);
					return;
				} catch (InteractionClassNotPublished i) {
					logger.error("{} Interaction Class Not Published", unpublishErrorMessage);
					logger.error(i);
					return;
				} catch (Exception e) {
					logger.error(e);
					CpswtUtils.sleepDefault();
				}
			}
		}
		
		_isPublished = false;
	}

	private static boolean _isSubscribed = false;
	private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.Int1:  could not subscribe:  ";
	/**
	* Subscribes a federate to the Int1 interaction class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void subscribe(RTIambassador rti) {
		if (_isSubscribed) return;
		
		init(rti);
	
		
		synchronized(rti) {
			boolean isNotSubscribed = true;
			while(isNotSubscribed) {
				try {
					rti.subscribeInteractionClass(get_handle());
					isNotSubscribed = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", subscribeErrorMessage);
					logger.error(f);
					return;
				} catch (InteractionClassNotDefined i) {
					logger.error("{} Interaction Class Not Defined", subscribeErrorMessage);
					logger.error(i);
					return;
				} catch (Exception e) {
					logger.error(e);
					CpswtUtils.sleepDefault();
				}
			}
		}
		
		_isSubscribed = true;
	}

	private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.Int1:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the Int1 interaction class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void unsubscribe(RTIambassador rti) {
		if (!_isSubscribed) return;

		init(rti);
		synchronized(rti) {
			boolean isNotUnsubscribed = true;
			while(isNotUnsubscribed) {
				try {
					rti.unsubscribeInteractionClass(get_handle());
					isNotUnsubscribed = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", unsubscribeErrorMessage);
					logger.error(f);
					return;
				} catch (InteractionClassNotDefined i) {
					logger.error("{} Interaction Class Not Defined", unsubscribeErrorMessage);
					logger.error(i);
					return;
				} catch (InteractionClassNotSubscribed i) {
					logger.error("{} Interaction Class Not Subscribed", unsubscribeErrorMessage);
					logger.error(i);
					return;
				} catch (Exception e) {
					logger.error(e);
					CpswtUtils.sleepDefault();
				}
			}
		}
		
		_isSubscribed = false;
	}

	/**
	* Return true if "handle" is equal to the handle (RTI assigned) of this class
	* (that is, the Int1 interaction class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the Int1 interaction class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the Int1 interaction class).
	*/
	public static boolean match(int handle) { return handle == get_handle(); }

	/**
	* Returns the handle (RTI assigned) of this instance's interaction class .
	* 
	* @return the handle (RTI assigned) if this instance's interaction class
	*/
	public int getClassHandle() { return get_handle(); }

	/**
	* Returns the fully-qualified (dot-delimited) name of this instance's interaction class.
	* 
	* @return the fully-qualified (dot-delimited) name of this instance's interaction class
	*/
	public String getClassName() { return get_class_name(); }

	/**
	* Returns the simple name (last name in its fully-qualified dot-delimited name)
	* of this instance's interaction class.
	* 
	* @return the simple name of this instance's interaction class 
	*/
	public String getSimpleClassName() { return get_simple_class_name(); }

	/**
	* Returns a set containing the names of all of the non-hiddenparameters of an
	* interaction class instance.
	*
	* @return set containing the names of all of the parameters of an
	* interaction class instance
	*/
	public Set< String > getParameterNames() { return get_parameter_names(); }

	/**
	* Returns a set containing the names of all of the parameters of an
	* interaction class instance.
	*
	* @return set containing the names of all of the parameters of an
	* interaction class instance
	*/
	public Set< String > getAllParameterNames() { return get_all_parameter_names(); }

	/**
	* Publishes the interaction class of this instance of the class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void publishInteraction(RTIambassador rti) { publish(rti); }

	/**
	* Unpublishes the interaction class of this instance of this class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void unpublishInteraction(RTIambassador rti) { unpublish(rti); }

	/**
	* Subscribes a federate to the interaction class of this instance of this class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void subscribeInteraction(RTIambassador rti) { subscribe(rti); }

	/**
	* Unsubscribes a federate from the interaction class of this instance of this class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void unsubscribeInteraction(RTIambassador rti) { unsubscribe(rti); }

	

	public String toString() {
		return "Int1("
			
			
			+ "boolVal:" + get_boolVal()
			+ "," + "intVal:" + get_intVal()
			+ "," + "strVal:" + get_strVal()
			+ ")";
	}
	



	
	
	private boolean _boolVal = false;
	
	private int _intVal = 0;
	
	private String _strVal = "";

	
	
	/**
	* Set the value of the "boolVal" parameter to "value" for this parameter.
	*
	* @param value the new value for the "boolVal" parameter
	*/
	public void set_boolVal( boolean value ) { _boolVal = value; }
	
	/**
	* Returns the value of the "boolVal" parameter of this interaction.
	*
	* @return the value of the "boolVal" parameter
	*/
	public boolean get_boolVal() { return _boolVal; }
	
	
	/**
	* Set the value of the "intVal" parameter to "value" for this parameter.
	*
	* @param value the new value for the "intVal" parameter
	*/
	public void set_intVal( int value ) { _intVal = value; }
	
	/**
	* Returns the value of the "intVal" parameter of this interaction.
	*
	* @return the value of the "intVal" parameter
	*/
	public int get_intVal() { return _intVal; }
	
	
	/**
	* Set the value of the "strVal" parameter to "value" for this parameter.
	*
	* @param value the new value for the "strVal" parameter
	*/
	public void set_strVal( String value ) { _strVal = value; }
	
	/**
	* Returns the value of the "strVal" parameter of this interaction.
	*
	* @return the value of the "strVal" parameter
	*/
	public String get_strVal() { return _strVal; }
	


	protected Int1( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected Int1( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the Int1 interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new Int1 interaction class instance
	*/
	public Int1( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #Int1( ReceivedInteraction datamemberMap )}, except this
	* new Int1 interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new Int1 interaction class instance
	* @param logicalTime timestamp for this new Int1 interaction class
	* instance
	*/
	public Int1( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new Int1 interaction class instance that is a duplicate
	* of the instance referred to by Int1_var.
	*
	* @param Int1_var Int1 interaction class instance of which
	* this newly created Int1 interaction class instance will be a
	* duplicate
	*/
	public Int1( Int1 Int1_var ) {
		super( Int1_var );
		
		
		set_boolVal( Int1_var.get_boolVal() );
		set_intVal( Int1_var.get_intVal() );
		set_strVal( Int1_var.get_strVal() );
	}


	/**
	* Returns the value of the parameter whose name is "datamemberName"
	* for this interaction.
	*
	* @param datamemberName name of parameter whose value is to be
	* returned
	* @return value of the parameter whose name is "datamemberName"
	* for this interaction
	*/
	public Object getParameter( String datamemberName ) {
		
		
		
		if (  "boolVal".equals( datamemberName )  ) return new Boolean(get_boolVal());
		else if (  "intVal".equals( datamemberName )  ) return new Integer(get_intVal());
		else if (  "strVal".equals( datamemberName )  ) return get_strVal();
		else return super.getParameter( datamemberName );
	}
	
	/**
	* Returns the value of the parameter whose handle (RTI assigned)
	* is "datamemberHandle" for this interaction.
	*
	* @param datamemberHandle handle (RTI assigned) of parameter whose
	* value is to be returned
	* @return value of the parameter whose handle (RTI assigned) is
	* "datamemberHandle" for this interaction
	*/
	public Object getParameter( int datamemberHandle ) {
		
				
		
		if ( get_boolVal_handle() == datamemberHandle ) return new Boolean(get_boolVal());
		else if ( get_intVal_handle() == datamemberHandle ) return new Integer(get_intVal());
		else if ( get_strVal_handle() == datamemberHandle ) return get_strVal();
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_boolVal_handle() ) set_boolVal( Boolean.parseBoolean(val) );
		else if ( param_handle == get_intVal_handle() ) set_intVal( Integer.parseInt(val) );
		else if ( param_handle == get_strVal_handle() ) set_strVal( val );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "boolVal".equals( datamemberName )  ) set_boolVal( Boolean.parseBoolean(val) );
		else if (  "intVal".equals( datamemberName )  ) set_intVal( Integer.parseInt(val) );
		else if (  "strVal".equals( datamemberName )  ) set_strVal( val );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "boolVal".equals( datamemberName )  ) set_boolVal( (Boolean)val );
		else if (  "intVal".equals( datamemberName )  ) set_intVal( (Integer)val );
		else if (  "strVal".equals( datamemberName )  ) set_strVal( (String)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_boolVal_handle(), Boolean.toString(get_boolVal()).getBytes() );
		
			datamembers.add( get_intVal_handle(), Integer.toString(get_intVal()).getBytes() );
		
			datamembers.add( get_strVal_handle(), get_strVal().getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof Int1 ) {
			Int1 data = (Int1)object;
			
			
				_boolVal = data._boolVal;
				_intVal = data._intVal;
				_strVal = data._strVal;
			
		}
	}
}
