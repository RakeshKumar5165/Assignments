var questions = 7;
var questionsLeft = ' [' + questions + ' questions left]';
var name = prompt('Please type an NAME' + questionsLeft);
questions -= 1;
var questionsLeft = ' [' + questions + ' questions left]';
var color = prompt('Please type an Color among top 16' + questionsLeft);
questions -= 1;
questionsLeft = ' [' + questions + ' questions left]';
var adjective = prompt('Please type an adjective' + questionsLeft);
questions -= 1;
questionsLeft = ' [' + questions + ' questions left]';
var verb = prompt('Please type a verb that does not end in -ing ' + questionsLeft);
questions -= 1;
questionsLeft = ' [' + questions + ' questions left]';
var noun = prompt('Please type a noun' + questionsLeft);
questions -= 1;
questionsLeft = ' [' + questions + ' questions left]';

var rand1 = prompt('Please type a Ramdom' + questionsLeft);
questions -= 1;
questionsLeft = ' [' + questions + ' questions left]';

var rand2 = prompt('Please type a noun' + questionsLeft);
alert('All done. Ready for the message?');
var sentence = "<p>ONCE upon a time there was a prince named <div style='color:"+color+"'>" +name+"</div>";
sentence+=" He was <div style='color:"+color+"'>" +adjective+"</div> who wanted to marry a princess; but she would have to be a real princess." ;
sentence+=" He travelled <div style='color:"+color+"'>" +verb+"</div> all over the world to find one, but nowhere could he get what he wanted.";
sentence+=" There were princesses enough, but it was difficult to find out whether they were real ones.";
sentence+=" There was always something about<div style='color:"+color+"'>" +noun+"</div> them that was not as it should be.";
sentence+=" So he came home again and was sad, for he would have liked very much to have a real princess.";
sentence+=" One evening a terrible storm came on; there was thunder and lightning, and the rain poured down in torrents.";
sentence+=" Suddenly a knocking was heard at the city gate, and the old king went to open it.";
sentence+=" It was a princess standing <div style='color:"+color+"'>" +rand1+"</div> out there in front of the gate.";
sentence+=" But, good gracious! what a sight the rain and the wind had made her look.";
sentence+=" The water ran down from her hair and clothes; it ran down into the toes of her shoes and out again at the heels.";
sentence+=" And yet she said that she was a real princess.</p>";

sentence+="<p>Well, we'll soon find that <div style='color:"+color+"'>" +name+"</div> out, thought the old queen. But she said nothing, went into the bed-room, took all the bedding off the bedstead, and laid a pea on the bottom; then she took twenty mattresses and laid them on the pea, and then twenty eider-down beds on top of the mattresses.On this the princess had to lie all night. In the morning she was asked how she had slept.Oh, very badly! said she. I have scarcely closed my eyes all night. Heaven only knows what was in the bed, but I was lying on something hard, so that I am black and blue all over my body. It's horrible!";
sentence+="Now they knew that she was a real princess because she had felt the pea right through the twenty mattresses and the twenty eider-down beds.";
sentence+="Nobody but a real princess could be as sensitive as that. ";
sentence+="So the prince took her for his wife, for now he knew that he had a real princess; and the pea was put in the museum, where it may still be seen, if no one has stolen it. </p>";

document.write(sentence);