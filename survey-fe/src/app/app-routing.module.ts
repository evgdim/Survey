import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { SurveyOverviewComponent } from './survey-overview/survey-overview.component';
import { SurveyNewComponent } from './survey-new/survey-new.component';

const routes: Routes = [
  { path: '', component: SurveyOverviewComponent, pathMatch: 'full' },
  { path: 'new', component: SurveyNewComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  providers: []
})
export class AppRoutingModule { }
