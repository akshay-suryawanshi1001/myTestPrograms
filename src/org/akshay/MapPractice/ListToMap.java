package org.akshay.MapPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
	public  ArrayList<TemplateDto> getTemplateList(){
		ArrayList<TemplateDto> ak = new ArrayList<TemplateDto>();
		/*ak = new ArrayList(Arrays.asList(new TemplateDto(11L, "aa", 2L),
				new TemplateDto(11L, "bb", 2L),
				new TemplateDto(11L, "cc", 2L),
				new TemplateDto(12L, "dd", 2L),
				new TemplateDto(12L, "ee", 2L),
				new TemplateDto(13L, "ff", 2L),
				new TemplateDto(13L, "gg", 2L),
				new TemplateDto(13L, "hh", 2L)
				));*/
		ak.add(new TemplateDto(11L, "bb", 2L));
		ak.add(new TemplateDto(11L, "cc", 2L));
		ak.add(new TemplateDto(12L, "dd", 2L));
		ak.add(new TemplateDto(12L, "ee", 2L));
		ak.add(new TemplateDto(13L, "ff", 2L));
		ak.add(new TemplateDto(13L, "gg", 2L));
		ak.add(new TemplateDto(13L, "hh", 2L));
		return ak;
	}
	
	public static void main(String args[]) {
		ListToMap listToMap = new ListToMap();
		List<TemplateDto> list = listToMap.getTemplateList();
		//List<TemplateDto> list = new ArrayList (list1);
		List<TemplateDto> list2 = listToMap.getTemplateList();
		//Set<TemplateDto> set = new HashSet<TemplateDto>(list);
		Set<Long> lss = list2.stream().map(l -> l.getOrderId()).collect(Collectors.toSet());
		List<Long> ll = new ArrayList<Long>(lss);
		//Map<Long, TemplateDto> modalityMap = list.stream().collect(Collectors.toMap(TemplateDto::getOrderId,
          //      Function.identity()));
		//Iterator itr = modalityMap.keySet().iterator();
		//while(itr.hasNext()) {
			//System.out.println(itr);
	//	}
		Map<Long,List<TemplateDto>> map = new HashMap<Long,List<TemplateDto>>();
		Iterator<TemplateDto> itr = list.listIterator();
		//while(itr.hasNext()) {
		for(Long l : lss) {
			List<TemplateDto> list3 = new ArrayList<TemplateDto>();
			for(TemplateDto li : list) {
				//TemplateDto dto = (TemplateDto) itr.next();
				if(l.equals(li.getOrderId())) {
					list3.add(li);
				}
			}
			map.put(l, list3);
			}
		//}
		//System.out.println(map);
		Iterator itr3 = map.keySet().iterator();
		while(itr3.hasNext()) {
			Long orderId = (Long)itr3.next();
			List<TemplateDto> currentList = map.get(orderId);
			System.out.println(orderId.toString() + "_" + currentList);
		}
	}

}
