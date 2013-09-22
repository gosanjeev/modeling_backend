package grammar.derivation

import grammar._

/**
 * @author A.Sirenko
 *          Date: 9/19/13
 */
class Query(
		val query: List[Symbol],
		val grammar: Grammar,
		val maxCountOfGeneratedSentences: Int,
		val maxLevelOfTransform: Int) {
}
