function reverseWords(sentence) {
    let reversedSentence = '';
    let word = '';
    let isWord = false;

    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] !== ' ') {
            word = sentence[i] + word;
            isWord = true;
        } else {
            if (isWord) {
                reversedSentence += word + ' ';
                word = '';
                isWord = false;
            } else {
                reversedSentence += ' ';
            }
        }
    }

    if (isWord) {
        reversedSentence += word;
    }

    return reversedSentence;
}

const inputSentence = "This is a sample sentence";
const reversed = reverseWords(inputSentence);
console.log("Reversed sentence: " + reversed);
