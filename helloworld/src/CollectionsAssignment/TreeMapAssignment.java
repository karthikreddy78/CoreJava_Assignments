package CollectionsAssignment;

import java.util.Map.Entry;
import java.util.*;

public class TreeMapAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long p1 = 9908008431L;
				//Long.valueOf("9908008431");
		Long p2 = Long.valueOf("9948280610");
		Long p3 = Long.valueOf("9676354523");
		Long p4 = Long.valueOf("8309407463");
		Contact c1=new Contact(p1, "Ram", "mrr@gmail.com", Gender.Male);
		Contact c2=new Contact(p2, "Hema", "mhh@gmail.com", Gender.Female);
		Contact c3=new Contact(p3, "Karthik", "mkr@gmail.com", Gender.valueOf("Male"));
		Contact c4=new Contact(p4, "Deepak", "mdr@gmail.com", Gender.valueOf("Male"));
		
		Map<Long,Contact> cntMap = new TreeMap<>(Collections.reverseOrder());
		//Map<Long,Contact> cntMap = new TreeMap<>();
		cntMap.put(p1, c1);
		cntMap.put(p2, c2);
		cntMap.put(p3, c3);
		cntMap.put(p4, c4);
		Set<Entry<Long,Contact>> entrySet =cntMap.entrySet();
		Iterator<Entry<Long,Contact>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Long,Contact> entry = (Map.Entry<Long, Contact>)iterator.next();
			Long p= entry.getKey();
			Contact c = entry.getValue();
			System.out.println(p);
			System.out.println(c);
		}
		System.out.println();
		
		Map<Contact,Long> cntMap1 = new TreeMap<>();
		cntMap1.put(c1, p1);
		cntMap1.put(c2, p2);
		cntMap1.put(c3, p3);
		cntMap1.put(c4, p4);
		Set<Entry<Contact,Long>> entrySet1 =cntMap1.entrySet();
		Iterator<Entry<Contact,Long>> iterator1 = entrySet1.iterator();
		while(iterator1.hasNext())
		{
			Map.Entry<Contact,Long> entry = (Map.Entry<Contact,Long>)iterator1.next();
			Long p= entry.getValue();
			Contact c = entry.getKey();
			System.out.println(p);
			System.out.println(c);
		}
	
	
	
	}

}
