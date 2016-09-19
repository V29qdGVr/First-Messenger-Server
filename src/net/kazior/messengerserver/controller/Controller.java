package net.kazior.messengerserver.controller;

import net.kazior.messengerserver.model.Model;

public class Controller {

	private Model model;
	private TcpServerMulti tcpServerMulti;
	
	public Controller() {
		model = new Model();
		tcpServerMulti = new TcpServerMulti();
		tcpServerMulti.setController(this);
		tcpServerMulti.listen();
	}
	
	public void receiveMessage(String message) {
		model.receiveAndSaveMessage(message);
	}
 }
