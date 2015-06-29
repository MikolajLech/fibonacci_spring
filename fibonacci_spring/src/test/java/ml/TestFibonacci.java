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
		service.setFibonacciElementIndex(0);
        assertEquals(0, service.getFibonacciElementVal());
    }
	
	@Test
    public void for1indexReturn1()
    {
    	service.setFibonacciElementIndex(1);
    	assertEquals(1, service.getFibonacciElementVal());
    }
	
	@Test
    public void for2indexReturn1()
    {
    	service.setFibonacciElementIndex(2);
    	assertEquals(1, service.getFibonacciElementVal());
    }
	
	@Test
    public void for3indexReturn2()
    {
    	service.setFibonacciElementIndex(3);
    	assertEquals(2, service.getFibonacciElementVal());
    }
	
	@Test
    public void for4indexReturn3()
    {
    	service.setFibonacciElementIndex(4);
    	assertEquals(3, service.getFibonacciElementVal());
    }
	
	@Test
    public void for5indexReturn5()
    {
    	service.setFibonacciElementIndex(5);
    	assertEquals(5, service.getFibonacciElementVal());
    }

	@Test
	public void for6indexReturn8()
	{
		service.setFibonacciElementIndex(6);
		assertEquals(8, service.getFibonacciElementVal());
	}
	
	@Test
	public void for7indexReturn13()
	{
		service.setFibonacciElementIndex(7);
		assertEquals(13, service.getFibonacciElementVal());
	}

	@Test
	public void for19indexReturn4181()
	{
		service.setFibonacciElementIndex(19);
		assertEquals(4181, service.getFibonacciElementVal());
	}
}
