package nl.nn.adapterframework.doc.testtarget.ibisdocref;

import nl.nn.adapterframework.doc.IbisDocRef;

public class Referrer {
	@IbisDocRef("nl.nn.adapterframework.doc.testtarget.ibisdocref.ChildTarget")
	public void setIbisDocRefClassNoOrderRefersIbisDocOrderDescriptionDefault(String value) {
	}

	@IbisDocRef("nl.nn.adapterframework.doc.testtarget.ibisdocref.ChildTarget.otherMethod")
	public void setIbisDocReffMethodNoOrderRefersIbisDocOrderDescriptionDefault(String value) {
	}

	@IbisDocRef({"10", "nl.nn.adapterframework.doc.testtarget.ibisdocref.ChildTarget"})
	public void setIbisDocRefClassWithOrderRefersIbisDocOrderDescriptionDefaultInherited(String value) {
	}
}
