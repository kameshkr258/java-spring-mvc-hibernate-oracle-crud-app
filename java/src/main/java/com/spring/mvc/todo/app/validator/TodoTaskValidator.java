package com.spring.mvc.todo.app.validator;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.spring.mvc.todo.app.model.TodoTask;


/**
 * 
 */
@Component
public class TodoTaskValidator extends BaseValidator {

	/**
	 *
	 */
	@Override
	public boolean supports(final Class<?> arg0) {
		return TodoTask.class.isAssignableFrom(arg0);
	}

	/**
	 *
	 */
	@Override
	public void validate(final Object target, final Errors errors) {
		final TodoTask todoTask = (TodoTask) target;
		String title = todoTask.getTitle();
		String status = todoTask.getStatus();
		Date completionDate = todoTask.getCompletionDate();


		if (StringUtils.isEmpty(title)) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "EMPTY_TITLE","Title can not be empty.");
		} else if(title.length() > 256 ) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "INVALID_TITLE_LENGTH","Title length should be less than or equal to 256 characters.");
		}
		if (StringUtils.isEmpty(status)) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "status", "EMPTY_STATUS","Please select status.");
		} else if(title.length() > 10 ) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "status", "INVALID_STATUS_LENGTH","Status length should be less than or equal to 10 characters.");
		}
		if (StringUtils.isEmpty(completionDate)) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "completionDate", "EMPTY_DATE","Completion date can not be empty.");
		}
	}
}
