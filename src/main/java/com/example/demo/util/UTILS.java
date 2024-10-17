package com.example.demo.util;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UTILS {

    public static void showNotification(Notification notification, String message, boolean isSuccess){
        notification.removeAll();
        notification.removeThemeVariants(NotificationVariant.LUMO_ERROR);
        notification.removeThemeVariants(NotificationVariant.LUMO_SUCCESS);

        //errors for 0
        if(isSuccess == false){
            notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
        }
        else{
            notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
        }
        Div text = new Div(new Text(message));

        Button closeButton = new Button(new Icon("lumo", "cross"));
        closeButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY_INLINE);
        closeButton.setAriaLabel("Close");
        closeButton.addClickListener(event -> {
            notification.close();
        });

        HorizontalLayout layout = new HorizontalLayout(text, closeButton);
        layout.setAlignItems(FlexComponent.Alignment.CENTER);

        notification.add(layout);
        notification.setDuration(2000);
        notification.setPosition(Notification.Position.MIDDLE);
        notification.open();
    }
}
