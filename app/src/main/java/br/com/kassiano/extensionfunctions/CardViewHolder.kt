package br.com.kassiano.extensionfunctions

class CardViewHolder {

    fun bind(model: Card) {
        with(model) {
            setupTitle()
            setupSubtitle()
            setupStarCount()
        }
    }

    private fun Card.setupTitle() {}
    private fun Card.setupSubtitle() {}
    private fun Card.setupStarCount() {}
}

data class Card(
    val title: String,
    val subtitle: String,
    val starCount: Int
)