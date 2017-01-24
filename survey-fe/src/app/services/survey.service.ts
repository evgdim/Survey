import { Injectable } from '@angular/core';
import * as Rx from "rxjs/Rx";

import { Survey } from '../model/survey';

@Injectable()
export class SurveyService {
  surveys : any[] = [];
  constructor() {
    this.surveys = [
      { id:1, name: "Survey1", createDate: new Date() },
      { id:2, name: "Survey2", createDate: new Date() },
      { id:3, name: "Survey3", createDate: new Date() },
    ];
  }

  findSurveys() : Rx.Observable<Survey[]>{
    let s = this.surveys
    return Rx.Observable.create(function (observer) {
        observer.next(s);
        observer.complete();
    });
  }

  addSurvey(survey: Survey){
    survey.createDate = new Date();
    this.surveys.push(survey);
  }
}
