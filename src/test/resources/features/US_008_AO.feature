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














