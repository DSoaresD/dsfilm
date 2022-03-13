import './styles.css';
import { Link } from 'react-router-dom';
import { Movie } from 'types/movie';
import { useEffect, useState } from 'react';
import axios from 'axios';


 type Props = {
   movieId : string;
 }
 function FormCard( { movieId } : Props ) {

  const [movie, setMovie] = useState<Movie>()

    useEffect(() => {
        axios.get(`https://dsfilm.herokuapp.com/movies/${movieId}`)      //trocar pro ${BASE_URL}
        .then(response => {
            setMovie(response.data);
        });
    }, [movieId])

  return (
    <div className='dsfilm-form-container'>
      <img
        className='dsfilm-movie-card-image'
        src={movie?.image}
        alt={movie?.title}
      />
      <div className='dsfilm-card-bottom-container'>
        <h3>{movie?.title}</h3>
        <form className='dsfilm-form'>
          <div className='form-group dsfilm-form-group'>
            <label htmlFor='email'>Informe seu email</label>
            <input type='email' className='form-control' id='email' />
          </div>
          <div className='form-group dsfilm-form-group'>
            <label htmlFor='score'>Informe sua avaliação</label>
            <select className='form-control' id='score'>
              <option>1</option>
              <option>2</option>
              <option>3</option>
              <option>4</option>
              <option>5</option>
            </select>
          </div>
          <div className='dsfilm-form-btn-container'>
            <button type='submit' className='btn btn-primary dsfilm-btn'>
              Salvar
            </button>
          </div>
        </form>
        <Link to="/">
          <button className='btn btn-primary dsfilm-btn mt-3'>Cancelar</button>
        </Link>
      </div>
    </div>
  );
}

export default FormCard;
