import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { AppRoutingModule } from './app-routing.module';
import { MaterialModule } from '@angular/material';
import { FlexLayoutModule } from '@angular/flex-layout';

import { AppComponent } from './app.component';
import { SurveyService } from './services/survey.service';

import 'hammerjs';
import { SurveyOverviewComponent } from './survey-overview/survey-overview.component';
import { SurveyNewComponent } from './survey-new/survey-new.component';

@NgModule({
  declarations: [
    AppComponent,
    SurveyOverviewComponent,
    SurveyNewComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule,
    MaterialModule.forRoot(),
    FlexLayoutModule.forRoot()
  ],
  providers: [SurveyService],
  bootstrap: [AppComponent]
})
export class AppModule { }
