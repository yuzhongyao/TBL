package com.example.demo.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@Route("login")
@AnonymousAllowed
public class LoginView extends VerticalLayout {

    public LoginView(){
        setSizeFull();
        setAlignItems(Alignment.CENTER);

        var login = new LoginForm();
        login.setAction("login");

        H1 title = new H1("Toronto Big League");

        this.add(title, login);
    }


}
