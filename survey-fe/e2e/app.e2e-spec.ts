import { SurveyFePage } from './app.po';

describe('survey-fe App', function() {
  let page: SurveyFePage;

  beforeEach(() => {
    page = new SurveyFePage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
