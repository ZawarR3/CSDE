package com.r3.developers.csdetemplate.workflows;

import net.corda.v5.base.types.MemberX500Name;

// A class to hold the arguments required to start the flow
public class MyFirstFlowStartArgs {
    public MemberX500Name otherMember;

    public MyFirstFlowStartArgs(MemberX500Name otherMember) {
        this.otherMember = otherMember;
    }

    // The JSON Marshalling Service, which handles serialisation, needs this constructor.
    public MyFirstFlowStartArgs() {}
}
