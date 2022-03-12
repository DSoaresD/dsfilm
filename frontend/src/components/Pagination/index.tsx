import{ReactComponent as Arrow} from "assets/img/arrow.svg"
import './styles.css'

function Pagination() {
  return (
    <div className='dsfilm-pagination-container'>
      <div className='dsfilm-pagination-box'>
        <button className='dsfilm-pagination-button' disabled={true}>
          <Arrow />
        </button>
        <p>{`${1} de ${3}`}</p>
        <button className='dsfilm-pagination-button' disabled={false}>
          <Arrow className='dsfilm-flip-horizontal' />
        </button>
      </div>
    </div>
  );
}

export default Pagination;
