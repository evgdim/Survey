import { Component, OnInit } from '@angular/core';
import * as Rx from "rxjs/Rx";

import { Survey } from '../model/survey';
import { SurveyService } from '../services/survey.service';

@Component({
  selector: 'app-survey-overview',
  templateUrl: './survey-overview.component.html',
  styleUrls: ['./survey-overview.component.css']
})
export class SurveyOverviewComponent implements OnInit {
  surveys: Rx.Observable<Survey[]>;
  constructor(private surveyServ: SurveyService){}

  ngOnInit() {
    this.surveys = this.surveyServ.findSurveys();
    this.surveys.subscribe(s => console.log(s));
  }

}
