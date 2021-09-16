package com.batch.tasklet;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class CounterIncremenTasklet implements Tasklet{

    private static final String MY_COUNTER_KEY = "MY.COUNTER";
    private static final int DEFAULT_VALUE = 0;

    private Integer counter;

    public RepeatStatus execute(final StepContribution contribution, final ChunkContext chunkContext) throws Exception {

        // JobExecutionContext�� access �ϴ� ���.
        final ExecutionContext jobExecutionContext = chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext();

        // setter�� ���� ���� �������� ���� ��� jobExecutionContext���� ���� �ҷ��´�.
        // jobExecutionContext�� MY.COUNTER��� Ű/�� ���� ��� 0�� �⺻ ������ ������.
        if (counter == null) {
            counter = jobExecutionContext.getInt(MY_COUNTER_KEY, DEFAULT_VALUE);
        }

        // �ֿܼ� ī���� �� ���.
        System.out.println("ī����: " + counter);

        // ī���� + 1�� ���� jobExecutionContext�� ����.
        jobExecutionContext.put(MY_COUNTER_KEY, counter + 1);

        return RepeatStatus.FINISHED;
    }

    public void setCounter(final Integer counter) {
        this.counter = counter;
    }
}
