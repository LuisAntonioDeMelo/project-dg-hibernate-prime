package br.com.drogaria.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class Ctrltest {
	public void estouVivo() {
		System.out.println("Estou vivo!!");
	}
}
