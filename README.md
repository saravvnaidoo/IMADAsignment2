# Hack or Myth? - The Ultimate Flashcard Challenge

## 🌟 Introduction
In an era of viral "life hacks" and internet rumors, distinguishing fact from fiction is more important than ever. **Hack or Myth?** is a premium, native Android application designed to test your common sense and educate you on real-world shortcuts. Whether it's saving your phone from water damage or opening a stubborn key ring, this app provides the answers with scientific and practical explanations.

## 📸 Visuals
| Welcome Screen | Quiz Interface | Score Summary |
| :---: | :---: | :---: |
| Welcome Screen | Quiz Interface | Score Summary |
| :---: | :---: | :---: |
| <img src="https://github.com/user-attachments/assets/d3f14c6e-2611-48a1-8008-6d7b4ecc1153" width="300" /> | <img src="https://github.com/user-attachments/assets/295e893e-c36a-4bbb-b546-7f8c894fec9a" width="300" /> | <img src="https://github.com/user-attachments/assets/739822d8-e7ea-421d-aaf5-ad98a77edbe2" width="300" /> |

*Detailed review lists are also available to provide deep-dives into every hack.*

## 🚀 Key Features
- **10 Curated Flashcards**: A balanced mix of true life hacks and viral urban myths.
- **Interactive Gameplay**: Simple "Hack" (True) or "Myth" (False) mechanics.
- **Instant Visual Feedback**: Immediate color-coded responses (Green for success, Red for correction).
- **Personalized Scoring**: Dynamic feedback based on your final tally (e.g., "Master Hacker" vs. "Stay Safe Online").
- **Knowledge Review**: A dedicated review section explaining the "Why" behind every answer.
- **Professional Design**: Optimized for usability with high-contrast text and intuitive navigation.

## 🛠 Technical Stack
- **Language**: 100% Kotlin
- **UI Framework**: XML with Material Design Components
- **Architecture**: Activity-based navigation with explicit Intents.
- **Components**:
    - `RecyclerView`: For efficient listing of review items.
    - `MaterialCardView`: For a modern, "flashcard" aesthetic.
    - `ConstraintLayout`: For responsive and consistent layouts across devices.
- **Data Layer**: Static Repository pattern for clean separation of concerns.

## 📋 Requirements & Implementation
- **Visual Appeal**: High-definition icons and Material design.
- **Usability**: Clear progress tracking (e.g., "Question 1/10") and simple action buttons.
- **Consistency**: Centralized theme in `themes.xml` and `colors.xml`.
- **Clean Code**: Zero redundant logic, descriptive variable names, and comprehensive Javadoc-style comments.

## 🔧 Installation
1. Clone the repository.
2. Open the project in **Android Studio (Ladybug or later)**.
3. Sync with Gradle.
4. Run on an emulator or physical device (API 24+).

## 👨‍💻 Commit History
1. `initial: set up project structure and gradle dependencies`
2. `feat: implement Question data model and QuestionRepository with 10 items`
3. `ui: design professional activity_main with high-contrast colors and clean fonts`
4. `feat: develop QuestionActivity with flashcard logic and dynamic feedback`
5. `ui: implement ScoreActivity with personalized performance feedback`
6. `feat: add ReviewActivity with RecyclerView for post-game study`
7. `refactor: extract all strings and colors for perfect theme consistency`
8. `docs: finalize detailed README with visual placeholders and technical specs`

---
*Developed for IMAD Assignment 2 - Promoting digital literacy and practical knowledge.*
