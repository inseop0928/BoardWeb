package com.batch.tasklet;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class HelloTasklet implements Tasklet{

	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//�۾����� ������� ����
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		// TODO Auto-generated method stub
		
		
		//logger.debug("bathch running");
		logger.info("��ġ����");
		//execute�� null�� ��ȯ�ϸ� RepeatStauts.Finished�� ��ȯ�Ѵٴ� �ǹ� ��, �ѹ��� ����ȴٴ� �ǹ�
		return null;
	}
}
