package org.omg.PortableServer;


/**
* org/omg/PortableServer/IdAssignmentPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u74/6087/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Friday, January 29, 2016 5:48:53 PM PST
*/


/**
	 * IdAssignmentPolicy specifies whether Object Ids in 
	 * the created POA are generated by the application or 
	 * by the ORB. The default is SYSTEM_ID.
	 */
public interface IdAssignmentPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
	 * specifies the policy value
	 */
  org.omg.PortableServer.IdAssignmentPolicyValue value ();
} // interface IdAssignmentPolicyOperations
