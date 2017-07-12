package com.rest.peace.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value="passwordValidator")
public class PasswordValidator implements Validator{
	@Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        UIInput passwordComponent = (UIInput) component.getAttributes().get("passwordComponent");
        String password  = passwordComponent.getValue().toString();
        String confirmPassword = (String) value;

        if (confirmPassword != null && !confirmPassword.equals(password)) {
            throw new ValidatorException(new FacesMessage(
                "Confirm password is not the same as password"));
        }
    }
}
