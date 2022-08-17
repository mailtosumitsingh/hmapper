package org.menlorobotics.hmapper;



public class PropInfo<Type> extends AbstractHierStore<Type> implements IHierStore<Type>  {
	private String writeSig;
	private String readSig;


	public String getWriteSig() {
		return writeSig;
	}
	public void setWriteSig(String writeSig) {
		this.writeSig = writeSig;
	}
	public String getReadSig() {
		return readSig;
	}
	public void setReadSig(String readSig) {
		this.readSig = readSig;
	}
		@Override
	public String toString() {
		return "PropInfo [name=" + name + ", propClass=" + propClass + "]";
	}

}
