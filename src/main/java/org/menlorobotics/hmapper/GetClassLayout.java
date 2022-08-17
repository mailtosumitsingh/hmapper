package org.menlorobotics.hmapper;

import java.util.LinkedHashMap;
import java.util.Map;


public class GetClassLayout {
	public static void main(String[] args) {
		String name = "org.ptg.models.Point";
		String newname = "org.ptg.models.Point";
		String id = "someid";
		String force = "sometype";
		String isRemap = "false";
		boolean addRemapPort  = false;
		if(isRemap!=null && isRemap.equalsIgnoreCase("true")){
			addRemapPort = true;
		}
		Map<String,String> stack = new LinkedHashMap<String,String>();
		PropGraph pg = new PropGraph();
		PropInfo<PropInfo> prop = pg.analyze(name, null,stack,0);
		if(newname!=null&&newname.length()>0){
			prop.setName(newname);
			prop.setPropClass(newname);
		}
		Generate g = new Generate();
		String ret = null;
		if(newname!=null&&newname.length()>0){
			ret = g.getHtml(id,newname, prop,force,addRemapPort);
		}else{
			ret = g.getHtml(id,name, prop,force,addRemapPort);
		}
	}

}
