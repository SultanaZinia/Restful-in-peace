package com.rest.peace.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value="emailValidator")
public class EmailValidator implements Validator {
	@Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        
        String enteredEmail = (String) value;
        //Set the email pattern string
        String emailPattern = "^[_A-Za-z0-9-]+(\\." +
    			"[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*" +
    			"(\\.[A-Za-z]{2,})$";
        Pattern p = Pattern.compile(emailPattern);
        
        //Match the given string with the pattern
        Matcher m = p.matcher(enteredEmail);
        
        //Check whether match is found
        boolean matchFound = m.matches();
        
        if (!matchFound) {
            FacesMessage message = new FacesMessage();
            message.setDetail("Email not valid");
            message.setSummary("Email not valid");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }
        
    }
}
