package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/NoSuchEndPoint.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u74/6087/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Friday, January 29, 2016 5:48:50 PM PST
*/

public final class NoSuchEndPoint extends org.omg.CORBA.UserException
{

  public NoSuchEndPoint ()
  {
    super(NoSuchEndPointHelper.id());
  } // ctor


  public NoSuchEndPoint (String $reason)
  {
    super(NoSuchEndPointHelper.id() + "  " + $reason);
  } // ctor

} // class NoSuchEndPoint
