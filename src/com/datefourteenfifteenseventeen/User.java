package com.datefourteenfifteenseventeen;

import java.util.Optional;

public class User {
public Optional<String> getUsername(Integer id){
	String name = null;
	if(id==100) {
		name = "Smruti";
	}else if(id==101) {
		name = "Mouli";
	}else if(id==102) {
		name = "Bubu";
}return Optional.ofNullable(name);
}
}