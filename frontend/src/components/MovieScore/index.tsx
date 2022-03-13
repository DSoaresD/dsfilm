import MovieStars from "components/MovieStars";
import "./styles.css"

type Props = {
  score:number;
  count:number;
}

function MovieScore({ score, count } : Props) {


  return (
    <div className='dsfilm-score-container'>
      <p className='dsfilm-score-value'>
        {score > 0 ? score.toFixed(1) : '-'}
      </p>
      <MovieStars score={score} />
      <p className='dsfilm-score-count'>{count} avaliações</p>
    </div>
  );
}

export default MovieScore;
