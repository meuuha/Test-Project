package com.meuuha.testproject;

import android.content.Context;

public class DataManager {
	
	private static DataManager instance;
	
	private DataManager(){
	}
	
	public static void init(Context context){
	}
	
	public static DataManager getInstance(){
		if(instance == null){
			instance = new DataManager();
		}
		return instance;
	}

}
