package com.drozd.nauka.service;

import com.drozd.nauka.model.Human;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class HumanSerializer {

	public void humanListToJson(List<Human> humanList, File file) throws IOException {
		ObjectMapper humanMapper = new ObjectMapper();
		humanMapper.writeValue(file, humanList);
	}
	public void toJson(Human human, File file) throws IOException {
		ObjectMapper humanMapper = new ObjectMapper();
		humanMapper.writeValue(file, human);
	}

}
