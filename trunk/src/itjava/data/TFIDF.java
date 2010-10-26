/**
 * 
 */
package itjava.data;

/**
 * @author Aniket
 *
 */
public class TFIDF {
	private  Number numOfOccurrences;
	private Number totalTermsInDocument;
	private Number totalDocuments;
	private Number numOfDocumentsWithTerm;
	
	public TFIDF(Number occ, Number totTerms, Number totDocs, Number docsWithTerms) {
		numOfOccurrences = occ;
		totalTermsInDocument = totTerms;
		totalDocuments = totDocs;
		numOfDocumentsWithTerm = docsWithTerms;
	}
	
	public Float Value(){
		float tf = numOfOccurrences.floatValue() / (Float.MIN_VALUE + totalTermsInDocument.floatValue());
		float idf = (float) Math.log10(totalDocuments.floatValue() / (Float.MIN_VALUE + numOfDocumentsWithTerm.floatValue()));
		return (tf * idf);
	}
	
	public int GetNumOfOccurrences() {
		return this.numOfOccurrences.intValue();
	}
	
	public String toString() {
		return this.Value().toString();
//		return "numOfOccurrences : " + this.numOfOccurrences.intValue() + "\n"
//			+ "totalTermsInDocument : " + this.totalTermsInDocument.intValue() + "\n"
//			+ "numOfDocumentsWithTerm : " + this.numOfDocumentsWithTerm.intValue() + "\n"
//			+ "totalDocuments : " + this.totalDocuments.intValue() + "\n"
//			+ "TFIDF : " + this.Value();
			
	}
	
}
