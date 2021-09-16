package com.batch.tasklet;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class HelloTasklet implements Tasklet{

	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//작업단위 기반으로 실행
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		// TODO Auto-generated method stub
		
		
		//logger.debug("bathch running");
		logger.info("배치실행");
		//execute에 null을 반환하면 RepeatStauts.Finished를 반환한다는 의미 즉, 한번만 실행된다는 의미
		return null;
	}
}
