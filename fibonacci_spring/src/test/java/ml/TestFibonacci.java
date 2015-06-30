package ml;

import static org.junit.Assert.assertEquals;
import ml.service.CustomerService;
import ml.service.CustomerServiceImpl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFibonacci {

	ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	CustomerService service = appContext.getBean("customerService", CustomerServiceImpl.class);
	
	@Test
	public void for0indexReturn0()
    {
		service.saveFibonacciElementIndex(0);
        assertEquals(0, service.findFibonacciElementVal(0));
    }
	
	@Test
    public void for1indexReturn1()
    {
    	service.saveFibonacciElementIndex(1);
    	assertEquals(1, service.findFibonacciElementVal(1));
    }
	
	@Test
    public void for2indexReturn1()
    {
    	service.saveFibonacciElementIndex(2);
    	assertEquals(1, service.findFibonacciElementVal(2));
    }
	
	@Test
    public void for3indexReturn2()
    {
    	service.saveFibonacciElementIndex(3);
    	assertEquals(2, service.findFibonacciElementVal(3));
    }
	
	@Test
    public void for4indexReturn3()
    {
    	service.saveFibonacciElementIndex(4);
    	assertEquals(3, service.findFibonacciElementVal(4));
    }
	
	@Test
    public void for5indexReturn5()
    {
    	service.saveFibonacciElementIndex(5);
    	assertEquals(5, service.findFibonacciElementVal(5));
    }

	@Test
	public void for6indexReturn8()
	{
		service.saveFibonacciElementIndex(6);
		assertEquals(8, service.findFibonacciElementVal(6));
	}
	
	@Test
	public void for7indexReturn13()
	{
		service.saveFibonacciElementIndex(7);
		assertEquals(13, service.findFibonacciElementVal(7));
	}

	@Test
	public void for19indexReturn4181()
	{
		service.saveFibonacciElementIndex(19);
		assertEquals(4181, service.findFibonacciElementVal(19));
	}
}
