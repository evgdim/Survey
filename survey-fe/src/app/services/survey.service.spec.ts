/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { SurveyService } from './survey.service';

describe('SurveyService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SurveyService]
    });
  });

  it('should ...', inject([SurveyService], (service: SurveyService) => {
    expect(service).toBeTruthy();
  }));
});
