
package TripleFederation;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The Obj1 class implements the Obj1 object in the
* TripleFederation simulation.
*/
public class Obj1 extends ObjectRoot {

	private static final Logger logger = LogManager.getLogger(Obj1.class);

	/**
	* Default constructor -- creates an instance of the Obj1 object
	* class with default attribute values.
	*/
	public Obj1() { }

	
	
	private static int _Obj1Attr1_handle;
	private static int _Obj1Attr2_handle;
	private static int _Obj1Attr3_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "Obj1Attr1" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "Obj1Attr1" attribute
	*/
	public static int get_Obj1Attr1_handle() { return _Obj1Attr1_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "Obj1Attr2" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "Obj1Attr2" attribute
	*/
	public static int get_Obj1Attr2_handle() { return _Obj1Attr2_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "Obj1Attr3" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "Obj1Attr3" attribute
	*/
	public static int get_Obj1Attr3_handle() { return _Obj1Attr3_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the Obj1 object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the Obj1
	* object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "ObjectRoot.Obj1"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the Obj1 object class.
	*/
	public static String get_simple_class_name() { return "Obj1"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden attributes in the
	* Obj1 object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return a set of parameter names pertaining to the reference,\
	* rather than the parameter names of the class for the instance referred to by
	* the reference.  For the polymorphic version of this method, use
	* {@link #getAttributeNames()}.
	*/
	public static Set< String > get_attribute_names() {
		return new HashSet< String >(_datamemberNames);
	}


	/**
	* Returns a set containing the names of all of the attributes in the
	* Obj1 object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return a set of parameter names pertaining to the reference,\
	* rather than the parameter names of the class for the instance referred to by
	* the reference.  For the polymorphic version of this method, use
	* {@link #getAttributeNames()}.
	*/
	public static Set< String > get_all_attribute_names() {
		return new HashSet< String >(_allDatamemberNames);
	}


	
	private static AttributeHandleSet _publishedAttributeHandleSet;
	private static Set< String > _publishAttributeNameSet = new HashSet< String >();

	private static AttributeHandleSet _subscribedAttributeHandleSet; 
	private static Set< String > _subscribeAttributeNameSet = new HashSet< String >();

	

	static {
		_classNameSet.add("ObjectRoot.Obj1");
		_classNameClassMap.put("ObjectRoot.Obj1", Obj1.class);
		
		_datamemberClassNameSetMap.put("ObjectRoot.Obj1", _datamemberNames);
		_allDatamemberClassNameSetMap.put("ObjectRoot.Obj1", _allDatamemberNames);

		
		
		_datamemberNames.add("Obj1Attr1");
		_datamemberNames.add("Obj1Attr2");
		_datamemberNames.add("Obj1Attr3");
		
		
		_allDatamemberNames.add("Obj1Attr1");
		_allDatamemberNames.add("Obj1Attr2");
		_allDatamemberNames.add("Obj1Attr3");
		
		
		_datamemberTypeMap.put("Obj1Attr1", "boolean");
		_datamemberTypeMap.put("Obj1Attr2", "int");
		_datamemberTypeMap.put("Obj1Attr3", "String");
	

		_classNamePublishAttributeNameMap.put("ObjectRoot.Obj1", _publishAttributeNameSet);
		_publishedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNamePublishedAttributeMap.put("ObjectRoot.Obj1", _publishedAttributeHandleSet);

		_classNameSubscribeAttributeNameMap.put("ObjectRoot.Obj1", _subscribeAttributeNameSet);
		_subscribedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNameSubscribedAttributeMap.put("ObjectRoot.Obj1", _subscribedAttributeHandleSet);
	

	}


	private static String initErrorMessage = "Error:  ObjectRoot.Obj1:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		ObjectRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getObjectClassHandle("ObjectRoot.Obj1");
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

		_classNameHandleMap.put("ObjectRoot.Obj1", get_handle());
		_classHandleNameMap.put(get_handle(), "ObjectRoot.Obj1");
		_classHandleSimpleNameMap.put(get_handle(), "Obj1");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_Obj1Attr1_handle = rti.getAttributeHandle("Obj1Attr1", get_handle());			
				_Obj1Attr2_handle = rti.getAttributeHandle("Obj1Attr2", get_handle());			
				_Obj1Attr3_handle = rti.getAttributeHandle("Obj1Attr3", get_handle());
				isNotInitialized = false;
			} catch (FederateNotExecutionMember f) {
				logger.error("{} Federate Not Execution Member", initErrorMessage);
				logger.error(f);
				return;
			} catch (ObjectClassNotDefined i) {
				logger.error("{} Object Class Not Defined", initErrorMessage);
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
			
			
		_datamemberNameHandleMap.put("ObjectRoot.Obj1,Obj1Attr1", get_Obj1Attr1_handle());
		_datamemberNameHandleMap.put("ObjectRoot.Obj1,Obj1Attr2", get_Obj1Attr2_handle());
		_datamemberNameHandleMap.put("ObjectRoot.Obj1,Obj1Attr3", get_Obj1Attr3_handle());
			
			
		_datamemberHandleNameMap.put(get_Obj1Attr1_handle(), "Obj1Attr1");
		_datamemberHandleNameMap.put(get_Obj1Attr2_handle(), "Obj1Attr2");
		_datamemberHandleNameMap.put(get_Obj1Attr3_handle(), "Obj1Attr3");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  ObjectRoot.Obj1:  could not publish:  ";

	/**
	* Publishes the Obj1 object class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void publish(RTIambassador rti) {
		if (_isPublished) return;
		
		init(rti);

		
		_publishedAttributeHandleSet.empty();
		for(String attributeName : _publishAttributeNameSet) {
			try {
				_publishedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.Obj1," + attributeName));
			} catch (Exception e) {
				logger.error("{} Could not publish \"" + attributeName + "\" attribute.", publishErrorMessage);
			}
		}
	

		synchronized(rti) {
			boolean isNotPublished = true;
			while(isNotPublished) {
				try {
					rti.publishObjectClass(get_handle(), _publishedAttributeHandleSet);
					isNotPublished = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", publishErrorMessage);
					logger.error(f);
					return;
				} catch (ObjectClassNotDefined i) {
					logger.error("{} Object Class Not Defined", publishErrorMessage);
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

	private static String unpublishErrorMessage = "Error:  ObjectRoot.Obj1:  could not unpublish:  ";
	/**
	* Unpublishes the Obj1 object class for a federate.
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
					rti.unpublishObjectClass(get_handle());
					isNotUnpublished = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", unpublishErrorMessage);
					logger.error(f);
					return;
				} catch (ObjectClassNotDefined i) {
					logger.error("{} Object Class Not Defined", unpublishErrorMessage);
					logger.error(i);
					return;
				} catch (ObjectClassNotPublished i) {
					logger.error("{} Object Class Not Published", unpublishErrorMessage);
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
	private static String subscribeErrorMessage = "Error:  ObjectRoot.Obj1:  could not subscribe:  ";
	/**
	* Subscribes a federate to the Obj1 object class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void subscribe(RTIambassador rti) {
		if (_isSubscribed) return;
		
		init(rti);
		
		_subscribedAttributeHandleSet.empty();
		for(String attributeName : _subscribeAttributeNameSet) {
			try {
				_subscribedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.Obj1," + attributeName));
			} catch (Exception e) {
				logger.error("{} Could not subscribe to \"" + attributeName + "\" attribute.", subscribeErrorMessage);
			}
		}
	
		
		synchronized(rti) {
			boolean isNotSubscribed = true;
			while(isNotSubscribed) {
				try {
					rti.subscribeObjectClassAttributes(get_handle(), _subscribedAttributeHandleSet);
					isNotSubscribed = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", subscribeErrorMessage);
					logger.error(f);
					return;
				} catch (ObjectClassNotDefined i) {
					logger.error("{} Object Class Not Defined", subscribeErrorMessage);
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

	private static String unsubscribeErrorMessage = "Error:  ObjectRoot.Obj1:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the Obj1 object class.
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
					rti.unsubscribeObjectClass(get_handle());
					isNotUnsubscribed = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", unsubscribeErrorMessage);
					logger.error(f);
					return;
				} catch (ObjectClassNotDefined i) {
					logger.error("{} Object Class Not Defined", unsubscribeErrorMessage);
					logger.error(i);
					return;
				} catch (ObjectClassNotSubscribed i) {
					logger.error("{} Object Class Not Subscribed", unsubscribeErrorMessage);
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
	* (that is, the Obj1 object class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the Obj1 object class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the Obj1 object class).
	*/
	public static boolean match(int handle) { return handle == get_handle(); }

	/**
	* Returns the handle (RTI assigned) of this instance's object class .
	* 
	* @return the handle (RTI assigned) if this instance's object class
	*/
	public int getClassHandle() { return get_handle(); }

	/**
	* Returns the fully-qualified (dot-delimited) name of this instance's object class.
	* 
	* @return the fully-qualified (dot-delimited) name of this instance's object class
	*/
	public String getClassName() { return get_class_name(); }

	/**
	* Returns the simple name (last name in its fully-qualified dot-delimited name)
	* of this instance's object class.
	* 
	* @return the simple name of this instance's object class 
	*/
	public String getSimpleClassName() { return get_simple_class_name(); }

	/**
	* Returns a set containing the names of all of the non-hiddenattributes of an
	* object class instance.
	*
	* @return set containing the names of all of the attributes of an
	* object class instance
	*/
	public Set< String > getAttributeNames() { return get_attribute_names(); }

	/**
	* Returns a set containing the names of all of the attributes of an
	* object class instance.
	*
	* @return set containing the names of all of the attributes of an
	* object class instance
	*/
	public Set< String > getAllAttributeNames() { return get_all_attribute_names(); }

	/**
	* Publishes the object class of this instance of the class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void publishObject(RTIambassador rti) { publish(rti); }

	/**
	* Unpublishes the object class of this instance of this class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void unpublishObject(RTIambassador rti) { unpublish(rti); }

	/**
	* Subscribes a federate to the object class of this instance of this class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void subscribeObject(RTIambassador rti) { subscribe(rti); }

	/**
	* Unsubscribes a federate from the object class of this instance of this class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void unsubscribeObject(RTIambassador rti) { unsubscribe(rti); }

	
	/**
	* Returns a data structure containing the handles of all attributes for this object
	* class that are currently marked for subscription.  To actually subscribe to these
	* attributes, a federate must call <objectclassname>.subscribe(RTIambassador rti).
	*
	* @return data structure containing the handles of all attributes for this object
	* class that are currently marked for subscription
	*/
	public AttributeHandleSet getSubscribedAttributeHandleSet() { return _subscribedAttributeHandleSet; }
	

	public String toString() {
		return "Obj1("
			
			
			+ "Obj1Attr1:" + get_Obj1Attr1()
			+ "," + "Obj1Attr2:" + get_Obj1Attr2()
			+ "," + "Obj1Attr3:" + get_Obj1Attr3()
			+ ")";
	}
	



	
	
	/**
	* Publishes the "Obj1Attr1" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "Obj1Attr1" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_Obj1Attr1() {
		_publishAttributeNameSet.add( "Obj1Attr1" );
	}

	/**
	* Unpublishes the "Obj1Attr1" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "Obj1Attr1" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_Obj1Attr1() {
		_publishAttributeNameSet.remove( "Obj1Attr1" );
	}
	
	/**
	* Subscribes a federate to the "Obj1Attr1" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "Obj1Attr1" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_Obj1Attr1() {
		_subscribeAttributeNameSet.add( "Obj1Attr1" );
	}

	/**
	* Unsubscribes a federate from the "Obj1Attr1" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "Obj1Attr1" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_Obj1Attr1() {
		_subscribeAttributeNameSet.remove( "Obj1Attr1" );
	}
	
	
	/**
	* Publishes the "Obj1Attr2" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "Obj1Attr2" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_Obj1Attr2() {
		_publishAttributeNameSet.add( "Obj1Attr2" );
	}

	/**
	* Unpublishes the "Obj1Attr2" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "Obj1Attr2" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_Obj1Attr2() {
		_publishAttributeNameSet.remove( "Obj1Attr2" );
	}
	
	/**
	* Subscribes a federate to the "Obj1Attr2" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "Obj1Attr2" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_Obj1Attr2() {
		_subscribeAttributeNameSet.add( "Obj1Attr2" );
	}

	/**
	* Unsubscribes a federate from the "Obj1Attr2" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "Obj1Attr2" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_Obj1Attr2() {
		_subscribeAttributeNameSet.remove( "Obj1Attr2" );
	}
	
	
	/**
	* Publishes the "Obj1Attr3" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "Obj1Attr3" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_Obj1Attr3() {
		_publishAttributeNameSet.add( "Obj1Attr3" );
	}

	/**
	* Unpublishes the "Obj1Attr3" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "Obj1Attr3" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_Obj1Attr3() {
		_publishAttributeNameSet.remove( "Obj1Attr3" );
	}
	
	/**
	* Subscribes a federate to the "Obj1Attr3" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "Obj1Attr3" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_Obj1Attr3() {
		_subscribeAttributeNameSet.add( "Obj1Attr3" );
	}

	/**
	* Unsubscribes a federate from the "Obj1Attr3" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "Obj1Attr3" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_Obj1Attr3() {
		_subscribeAttributeNameSet.remove( "Obj1Attr3" );
	}
	

	
	
	private Attribute< Boolean > _Obj1Attr1 =
 		new Attribute< Boolean >(  new Boolean( false )  );
	
	/**
	* Set the value of the "Obj1Attr1" attribute to "value" for this object.
	*
	* @param value the new value for the "Obj1Attr1" attribute
	*/
	public void set_Obj1Attr1( boolean value ) {
		_Obj1Attr1.setValue( value );
		_Obj1Attr1.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "Obj1Attr1" attribute of this object.
	*
	* @return the value of the "Obj1Attr1" attribute
	*/
	public boolean get_Obj1Attr1() {
		return _Obj1Attr1.getValue();
	}
	
	/**
	* Returns the current timestamp of the "Obj1Attr1" attribute of this object.
	* 
	* @return the current timestamp of the "Obj1Attr1" attribute
	*/
	public double get_Obj1Attr1_time() {
		return _Obj1Attr1.getTime();
	}
	
	
	private Attribute< Integer > _Obj1Attr2 =
 		new Attribute< Integer >(  new Integer( 0 )  );
	
	/**
	* Set the value of the "Obj1Attr2" attribute to "value" for this object.
	*
	* @param value the new value for the "Obj1Attr2" attribute
	*/
	public void set_Obj1Attr2( int value ) {
		_Obj1Attr2.setValue( value );
		_Obj1Attr2.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "Obj1Attr2" attribute of this object.
	*
	* @return the value of the "Obj1Attr2" attribute
	*/
	public int get_Obj1Attr2() {
		return _Obj1Attr2.getValue();
	}
	
	/**
	* Returns the current timestamp of the "Obj1Attr2" attribute of this object.
	* 
	* @return the current timestamp of the "Obj1Attr2" attribute
	*/
	public double get_Obj1Attr2_time() {
		return _Obj1Attr2.getTime();
	}
	
	
	private Attribute< String > _Obj1Attr3 =
 		new Attribute< String >(  new String( "" )  );
	
	/**
	* Set the value of the "Obj1Attr3" attribute to "value" for this object.
	*
	* @param value the new value for the "Obj1Attr3" attribute
	*/
	public void set_Obj1Attr3( String value ) {
		_Obj1Attr3.setValue( value );
		_Obj1Attr3.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "Obj1Attr3" attribute of this object.
	*
	* @return the value of the "Obj1Attr3" attribute
	*/
	public String get_Obj1Attr3() {
		return _Obj1Attr3.getValue();
	}
	
	/**
	* Returns the current timestamp of the "Obj1Attr3" attribute of this object.
	* 
	* @return the current timestamp of the "Obj1Attr3" attribute
	*/
	public double get_Obj1Attr3_time() {
		return _Obj1Attr3.getTime();
	}
	


	protected Obj1( ReflectedAttributes datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}
	
	protected Obj1( ReflectedAttributes datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}


	/**
	* Creates an instance of the Obj1 object class, using
	* "datamemberMap" to initialize its attribute values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new Obj1 object class instance
	*/
	public Obj1( ReflectedAttributes datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #Obj1( ReflectedAttributes datamemberMap )}, except this
	* new Obj1 object class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new Obj1 object class instance
	* @param logicalTime timestamp for this new Obj1 object class
	* instance
	*/
	public Obj1( ReflectedAttributes datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new Obj1 object class instance that is a duplicate
	* of the instance referred to by Obj1_var.
	*
	* @param Obj1_var Obj1 object class instance of which
	* this newly created Obj1 object class instance will be a
	* duplicate
	*/
	public Obj1( Obj1 Obj1_var ) {
		super( Obj1_var );
		
		
		set_Obj1Attr1( Obj1_var.get_Obj1Attr1() );
		set_Obj1Attr2( Obj1_var.get_Obj1Attr2() );
		set_Obj1Attr3( Obj1_var.get_Obj1Attr3() );
	}


	/**
	* Returns the value of the attribute whose name is "datamemberName"
	* for this object.
	*
	* @param datamemberName name of attribute whose value is to be
	* returned
	* @return value of the attribute whose name is "datamemberName"
	* for this object
	*/
	public Object getAttribute( String datamemberName ) {
		
		
		
		if (  "Obj1Attr1".equals( datamemberName )  ) return new Boolean(get_Obj1Attr1());
		else if (  "Obj1Attr2".equals( datamemberName )  ) return new Integer(get_Obj1Attr2());
		else if (  "Obj1Attr3".equals( datamemberName )  ) return get_Obj1Attr3();
		else return super.getAttribute( datamemberName );
	}
	
	/**
	* Returns the value of the attribute whose handle (RTI assigned)
	* is "datamemberHandle" for this object.
	*
	* @param datamemberHandle handle (RTI assigned) of attribute whose
	* value is to be returned
	* @return value of the attribute whose handle (RTI assigned) is
	* "datamemberHandle" for this object
	*/
	public Object getAttribute( int datamemberHandle ) {
		
				
		
		if ( get_Obj1Attr1_handle() == datamemberHandle ) return new Boolean(get_Obj1Attr1());
		else if ( get_Obj1Attr2_handle() == datamemberHandle ) return new Integer(get_Obj1Attr2());
		else if ( get_Obj1Attr3_handle() == datamemberHandle ) return get_Obj1Attr3();
		else return super.getAttribute( datamemberHandle );
	}
	
	protected boolean setAttributeAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_Obj1Attr1_handle() ) set_Obj1Attr1( Boolean.parseBoolean(val) );
		else if ( param_handle == get_Obj1Attr2_handle() ) set_Obj1Attr2( Integer.parseInt(val) );
		else if ( param_handle == get_Obj1Attr3_handle() ) set_Obj1Attr3( val );
		else retval = super.setAttributeAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "Obj1Attr1".equals( datamemberName )  ) set_Obj1Attr1( Boolean.parseBoolean(val) );
		else if (  "Obj1Attr2".equals( datamemberName )  ) set_Obj1Attr2( Integer.parseInt(val) );
		else if (  "Obj1Attr3".equals( datamemberName )  ) set_Obj1Attr3( val );	
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "Obj1Attr1".equals( datamemberName )  ) set_Obj1Attr1( (Boolean)val );
		else if (  "Obj1Attr2".equals( datamemberName )  ) set_Obj1Attr2( (Integer)val );
		else if (  "Obj1Attr3".equals( datamemberName )  ) set_Obj1Attr3( (String)val );		
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedAttributes createSuppliedDatamembers( boolean force ) {
		SuppliedAttributes datamembers = super.createSuppliedDatamembers( force );

	
		boolean isPublished = false;
		
		
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_Obj1Attr1_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.Obj1.createSuppliedAttributes:  could not determine if Obj1Attr1 is published.");
				isPublished = false;
			}
			if (  isPublished && _Obj1Attr1.shouldBeUpdated( force )  ) {
				datamembers.add( get_Obj1Attr1_handle(), Boolean.toString(get_Obj1Attr1()).getBytes() );
				_Obj1Attr1.setHasBeenUpdated();
			}
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_Obj1Attr2_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.Obj1.createSuppliedAttributes:  could not determine if Obj1Attr2 is published.");
				isPublished = false;
			}
			if (  isPublished && _Obj1Attr2.shouldBeUpdated( force )  ) {
				datamembers.add( get_Obj1Attr2_handle(), Integer.toString(get_Obj1Attr2()).getBytes() );
				_Obj1Attr2.setHasBeenUpdated();
			}
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_Obj1Attr3_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.Obj1.createSuppliedAttributes:  could not determine if Obj1Attr3 is published.");
				isPublished = false;
			}
			if (  isPublished && _Obj1Attr3.shouldBeUpdated( force )  ) {
				datamembers.add( get_Obj1Attr3_handle(), get_Obj1Attr3().getBytes() );
				_Obj1Attr3.setHasBeenUpdated();
			}
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof Obj1 ) {
			Obj1 data = (Obj1)object;
			
			
				_Obj1Attr1 = data._Obj1Attr1;
				_Obj1Attr2 = data._Obj1Attr2;
				_Obj1Attr3 = data._Obj1Attr3;
			
		}
	}
}
