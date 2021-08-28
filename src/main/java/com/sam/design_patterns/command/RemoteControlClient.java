package com.sam.design_patterns.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service
public class RemoteControlClient {
	
	@Autowired
	private RemoteControlInvoker remoteControl;
	
	public void configureRemoteControl(){
		
		Light livingRoomLight = new Light("living room");
		Light kitchenLight = new Light("kitchen");
		Light gymLight = new Light("gym");
		
		Ac livingRoomAc = new Ac("living room");
		Ac gymAc = new Ac("gym");
		
		Tv livingRoomTv = new Tv("living room");
		Tv bedRoomTv = new Tv("bed room");
		
		Command livingRoomLightOn = new LightOnCommand(livingRoomLight);;
		Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
		Command kitchenLightOn = new LightOnCommand(kitchenLight);
		Command kitchenLightOff = new LightOffCommand(kitchenLight);
		Command gymLightOn = new LightOnCommand(gymLight);
		Command gymLighttOff = new LightOffCommand(gymLight);
		
		Command livingRoomAcOn = new AcOnCommand(livingRoomAc);
		Command livingRoomAcOff = new AcOffCommand(livingRoomAc);
		Command gymAcOn = new AcOnCommand(gymAc);
		Command gymAcOff = new AcOffCommand(gymAc);
		
		Command livingRoomTvOn = new TvOnCommand(livingRoomTv);
		Command livingRoomTvOff = new TvOffCommand(livingRoomTv);
		Command bedRoomTvOn = new TvOnCommand(bedRoomTv);
		Command bedRoomTvOff = new TvOffCommand(bedRoomTv);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, gymLightOn, gymLighttOff);
		remoteControl.setCommand(3, livingRoomAcOn, livingRoomAcOff);
		remoteControl.setCommand(4, gymAcOn, gymAcOff);
		remoteControl.setCommand(5, livingRoomTvOn, livingRoomTvOff);
		remoteControl.setCommand(6, bedRoomTvOn, bedRoomTvOff);
		
		
		Light houseLights = new Light("House lights");
		Light ChrsitmasTreeLights = new Light("Chrsitmas Tree Lights");
		Light cribLights = new Light("Crib Lights");
		Command houseLightsOnCommand = new LightOnCommand(houseLights);
		Command houseLightsOffCommand = new LightOffCommand(houseLights);
		Command ChrsitmasTreeLightsOnCommand = new LightOnCommand(ChrsitmasTreeLights);
		Command ChrsitmasTreeLightsOffCommand = new LightOffCommand(ChrsitmasTreeLights);
		Command cribLightsOnCommand = new LightOnCommand(cribLights);
		Command cribLightsOffCommand = new LightOffCommand(cribLights);
		
		Command christmasDayMacroOnCommand = new MacroCommand(Lists.
				newArrayList(houseLightsOnCommand,ChrsitmasTreeLightsOnCommand,cribLightsOnCommand));
		Command christmasDayMacroOffCommand = new MacroCommand(Lists.
				newArrayList(houseLightsOffCommand,ChrsitmasTreeLightsOffCommand,cribLightsOffCommand));
		
		remoteControl.setCommand(7, christmasDayMacroOnCommand, christmasDayMacroOffCommand);
		
		System.out.println(livingRoomLightOn.toString()+0);	
		System.out.println(livingRoomLightOff.toString()+0);
		System.out.println(kitchenLightOn.toString()+1);
		System.out.println(kitchenLightOff.toString()+1);
		System.out.println(gymLightOn.toString()+2);
		System.out.println(gymLighttOff.toString()+2);
		System.out.println(livingRoomAcOn.toString()+3);
		System.out.println(livingRoomAcOff.toString()+3);
		System.out.println(gymAcOn.toString()+4);
		System.out.println(gymAcOff.toString()+4);
		System.out.println(livingRoomTvOn.toString()+5);
		System.out.println(livingRoomTvOff.toString()+5);
		System.out.println(bedRoomTvOn.toString()+6);
		System.out.println(bedRoomTvOff.toString()+6);		
	}
	
	public void on(int slot) {
		remoteControl.on(slot);
	}
	
    public void off(int slot) {
    	remoteControl.off(slot);
	}
    
    public void undo() {
    	remoteControl.undo();
   	}

}
