package com.ticketmanagement.ticketbookingSystem.customendspoint;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

@Endpoint(id="release-note")
@Component
public class CustomEndPoint {
	
	Map<String, List<String>> releaseNoteMap=new LinkedHashMap<>();
	
	@PostConstruct
	public void initNotes()
	{
		releaseNoteMap.put("Version-1.0",Arrays.asList("Release First One","Release SECOND One"));
		releaseNoteMap.put("Version-1.1",Arrays.asList("Release THIRD One","Release FOUR One"));
		releaseNoteMap.put("Version-1.2",Arrays.asList("Release FIVE One","Release SIXTH One"));
		releaseNoteMap.put("Version-1.3",Arrays.asList("Release FIVE One","Release SIXTH One"));
	}
	
	@ReadOperation
	public Map<String, List<String>> getReleaseNote()
	{
		return releaseNoteMap;
	}
	
	@ReadOperation
	public List<String> getReleaseNoteBySelector(@Selector String version)
	{
		return releaseNoteMap.get(version);
	}

}
