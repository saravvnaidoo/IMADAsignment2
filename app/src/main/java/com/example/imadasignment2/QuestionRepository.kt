package com.example.imadasignment2

object QuestionRepository {
    fun getQuestions(): List<Question> {
        return listOf(
            Question(
                "If you put your phone in dry rice, it will dry out faster and more effectively than air drying.",
                false,
                "Rice can actually slow down the drying process and might introduce dust or small particles into your phone. Air drying with a fan is often better."
            ),
            Question(
                "Using a staple remover to open a key ring can save your fingernails from breaking.",
                true,
                "It works perfectly! Slide the staple remover between the coils to create a gap for your key."
            ),
            Question(
                "You can use the 'tabs' on the ends of a tin foil or plastic wrap box to hold the roll in place.",
                true,
                "Most boxes have perforated tabs on the sides that you can push in to keep the roll from falling out."
            ),
            Question(
                "Putting a wooden spoon over a boiling pot of water will prevent it from boiling over.",
                true,
                "The spoon pops the bubbles and also absorbs some heat, helping to prevent a mess."
            ),
            Question(
                "Sugar can help heal a burnt tongue by speeding up the healing process of the tissue.",
                false,
                "Sugar might provide temporary relief by distracting your taste buds, but it doesn't actually heal the burn."
            ),
            Question(
                "Charging your phone overnight will significantly shorten its battery lifespan due to overcharging.",
                false,
                "Modern smartphones have circuits to stop charging when full. Heat is the bigger enemy of batteries, not the duration of the plug-in."
            ),
            Question(
                "You can clean a foggy car headlight using toothpaste and a soft cloth.",
                true,
                "The mild abrasives in toothpaste can polish away the oxidation on the plastic surface of the headlight."
            ),
            Question(
                "Wait 24 hours after a head injury before letting someone sleep to prevent a coma.",
                false,
                "This is a myth. If a person is alert and can hold a conversation, sleeping is generally fine, but they should be monitored."
            ),
            Question(
                "Using your phone at a gas station can cause an explosion due to static electricity or radio waves.",
                false,
                "There are no documented cases of a cell phone causing a fire at a gas pump. Static electricity from your body is a higher risk."
            ),
            Question(
                "A battery will last longer if you store it in the freezer.",
                false,
                "Extreme cold can actually damage batteries. It is best to store them at room temperature in a dry place."
            )
        )
    }
}
