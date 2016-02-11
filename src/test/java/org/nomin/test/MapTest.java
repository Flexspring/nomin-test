package org.nomin.test;
import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.nomin.NominMapper;
import org.nomin.core.Nomin;
import org.nomin.entity.Gender;

public class MapTest {
	NominMapper nomin = new Nomin("map2map.groovy");
	Map<String, Object> source;

	@Before
	public void before() throws ParseException {
		source = new HashMap<String, Object>();
		source.put("name", "Romain");
		source.put("gender", Gender.MALE);
	}

	@Test
	public void testMap2Map() {
		@SuppressWarnings("unchecked")
		Map<String, Object> target = nomin.map(source, HashMap.class);

		assertEquals("Romain", target.get("firstName"));
		assertEquals(true, target.get("male"));
	}
}