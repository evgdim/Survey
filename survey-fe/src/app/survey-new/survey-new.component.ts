import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { FormControl } from '@angular/forms';
import { Validators } from '@angular/forms';

@Component({
  selector: 'app-survey-new',
  templateUrl: './survey-new.component.html',
  styleUrls: ['./survey-new.component.css']
})
export class SurveyNewComponent implements OnInit {
  newSurveyForGroup: FormGroup;
  constructor() { }

  ngOnInit() {
    this.newSurveyForGroup = new FormGroup({
      id: new FormControl("", Validators.required),
      name: new FormControl("", Validators.required)
    });
  }

  onSubmit(surveyForm: FormGroup){
    if(surveyForm.valid){
      console.log(surveyForm);
    } else {
      console.log("not valid");
    }
  }
}
