package Сѧ������ϵͳ;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class login {
	String name,major,Class,results;
	public login(String name,String major,String Class) {
		this.name = name;
		this.major = major;
		this.Class = Class;
		this.results = "101";
		//this.results = string;
	}
	public static boolean checklogin(String name,String major,String Class) {
		if((name.length()==0)||(major.length()==0)||(Class.length()==0)) {
			return false;
		}
		else{
			return true;
		}
	}
	public void getresult(String result) {
		this.results = result;
	}
	public String getname() {
		return this.name;
	}
	public String getmajor() {
		return this.major;
	}
	public String getclass() {
		return this.Class;
	}
	public String getresults() {
		String a = String.valueOf(results);
		return a;
	}

}
