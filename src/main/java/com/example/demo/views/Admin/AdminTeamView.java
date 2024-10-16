package com.example.demo.views.Admin;

import com.example.demo.services.*;
import com.example.demo.views.components.TeamStandingsGrid;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.security.AuthenticationContext;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;

@Route(value = "/admin/team", layout = AdminLayout.class)
@RolesAllowed("ADMIN")
public class AdminTeamView extends VerticalLayout {
    private final transient AuthenticationContext authenticationContext;
    private final TeamsService teamsService;
    private final AgesService agesService;
    private final GamesService gamesService;
    private final SeasonsService seasonsService;
    private final SessionsService sessionsService;

    private final LocationsService locationsService;

    @Autowired
    public AdminTeamView(AuthenticationContext authenticationContext, TeamsService teamsService, AgesService agesService, GamesService gamesService
            , SeasonsService seasonsService, SessionsService sessionsService, LocationsService locationsService){
        this.authenticationContext = authenticationContext;
        this.teamsService = teamsService;
        this.agesService = agesService;
        this.gamesService = gamesService;
        this.seasonsService = seasonsService;
        this.sessionsService = sessionsService;
        this.locationsService = locationsService;

        this.setAlignSelf(Alignment.CENTER);
        this.setAlignItems(Alignment.CENTER);


        add(new TeamStandingsGrid( authenticationContext,  teamsService,  agesService,  gamesService
                ,  seasonsService,  sessionsService,  locationsService));

        Button addTeam = new Button("Add Team");





    }





}
