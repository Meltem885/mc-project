@smoke


Feature: US_008 As a user, I should be able to see various titles and perform various controls on the homepage.

  Background:
    Given AO goes to home page

  Scenario: US_008_TC_001 Hypnotes Practice Management Software & EHR Features should be visible and
  All headings should be seen in the relevant section and
  The relevant section should be clickable and the relevant pages should be open.

    Then AO verifies Hypnotes Practice Management Software & EHR Features is visible
    Then AO verifies all headings are visible and clickable in the relevant section
    Then AO verifies all relevant pages are accessible
      | HIPAA-compliant Video Conferencing, TeleHealth - Hypnotes        |
      | Appointment Schedule - Hypnotes                                  |
      | eSign Documents Online During Therapy Appointment - Hypnotes     |
      | Security-HIPAA Compliant Software for Therapists - Hypnotes      |
      | Secure Billing Software for Therapist - Hypnotes                 |
      | Customize Service for Therapists - Hypnotes                      |
      | Get Organized: Automated Document Management - Hypnotes          |
      | Convert Your Handwritings to Text Easily - Hypnotes              |
      | Speech to Text: Convert Your Voice to Text - Hypnotes            |
      | Emotion Recognition with Biofeedback AI - Hypnotes               |
      | Build Your Therapist Website with Templates or Custom - Hypnotes |
      | Hypnotes Client/Patient Portal                                   |

  Scenario: US_009_TC_001 As a user, I should be able to see the Testimonials section on the homepage.

    Then AO verifies testimonials is visible
    Then AO verifies the accounts of the relevant persons are visible
    Then AO verifies < > buttons are visible and clickable

  Scenario: US_010_TC_001 As a user, some titles should be visible.

    Then AO verifies Everything you need for your practice management wrapped up in one solution is visible
    Then AO verifies Subtitles below this title is visible

  Scenario: US_011_TC_001 As a user, on the footer of the page I should be able to see the Explore, Features, Company Titles and related subtitles.

    Then AO verifies all headings are visible and clickable on the footer
    Then AO clicks on each headings on the footer and verifies related pages have the following URLs

      | https://hypnotes.net/blog/                                            |
      | https://test.hypnotes.net/pricing                                     |
      | https://test.hypnotes.net/how-it-works                                |
      | https://test.hypnotes.net/therapist-directory                         |
      | https://test.hypnotes.net/faq                                         |
      | https://test.hypnotes.net/features/therapy-appointment-scheduling     |
      | https://test.hypnotes.net/features/telehealth-video-conferencing      |
      | https://test.hypnotes.net/features/esign-documents-online             |
      | https://test.hypnotes.net/features/billing-software-for-therapists    |
      | https://test.hypnotes.net/features/biofeedback-ai-emotion-recognition |
      | https://test.hypnotes.net/features/speech-to-text                     |
      | https://test.hypnotes.net/features/ocr-handwriting-to-text            |
      | https://test.hypnotes.net/features/customize-service                  |
      | https://test.hypnotes.net/features/get-organized                      |
      | https://test.hypnotes.net/features/hipaa-security                     |
      | https://test.hypnotes.net/services/therapist-website-builder          |
      | https://test.hypnotes.net/client-patient-portal                       |
      | https://test.hypnotes.net/about-us                                    |
      | https://test.hypnotes.net/contact-us                                  |
      | https://test.hypnotes.net/privacy-policy                              |
      | https://test.hypnotes.net/terms-of-service                            |


  Scenario: US_012_TC_001 As a user, I should be able to select Client on the homepage.

    Then AO verifies Sign Up button is clickable
    When AO clicks on Sign Up button
    Then AO verifies Client and Therapist options should appear after clicking on Sign Up button
    Then AO verifies The client is clickable
    When AO clicks on the Client button
    When AO verifies the relevant page url is "https://test.hypnotes.net/register/client" after clicking on the Client button
    Then AO verifies Therapist button is clickable
    Then AO verifies the relevant page url is "https://test.hypnotes.net/register" after clicking on the Therapist button



















