package com.training.test_unit_spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

//need to add support for Junit Test Runner class
//define the context from which to fetch the resource
//add support for annotation based test (loader)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class,loader=AnnotationConfigContextLoader.class)
public class StudentServiceUnitTest {
	
	//inject the StudentService
	@Autowired
	private StudentService studentService;
	
	//Test cases  : are defined as methods decorated with @Test
	
	// prepare and clean up methods
	
	//prepare method executed auto before any of the test method is executed
	@BeforeClass
	public static void setUp() {
		//initialization task
	}
	
	//check if an appropriate StudentService impl is being injected
	@Test
	public void testImplType() {
		//for testing assert Method
		assertEquals("class com.training.test_unit_spring.StudentServiceImpl", this.studentService.getClass().toString());
	}
	
	@Test
	public void testContactNumber() {
		assertTrue(this.studentService.getStudentContact(3).startsWith("3"));
	}
	
	
	//test if object is being fetched
	@Test
	public void testObjectFetch() {
		Student student=this.studentService.getStudent(1);
		assertNotNull(student);
	}
	
	//clean up : executed after all test methods have been executed
	@AfterClass
	public static void afterAllTests() {
		//clean up activity
	}
	
	
	
	
	
	
	
	
}
