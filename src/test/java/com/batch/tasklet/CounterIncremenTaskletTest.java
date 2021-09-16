package com.batch.tasklet;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//��ġ job ��ġ ����
@ContextConfiguration(locations = { "classpath*:/com/batch/job/HelloJob.xml" })
public class CounterIncremenTaskletTest {
	
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private JobLauncherTestUtils jobLauncherTestUtils;

	@Test
	public void testExecute() throws Exception {
		
		//fail("Not yet implemented");
		
		final JobExecution jobExecution = jobLauncherTestUtils.launchJob();
        // job�� ���������� �������� Ȯ�δ�.
        Assert.assertEquals(ExitStatus.COMPLETED.getExitCode(), jobExecution.getExitStatus().getExitCode());
		
	}
}

