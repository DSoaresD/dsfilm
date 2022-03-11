//importando imagens
import {ReactComponent as GithubIcon} from "assets/img/github.svg"
import './styles.css'

function Navbar(){
    return(
        <header>
        <nav className="container">
          <div className="dsfilm-nav-content">
            <h1>DSFilms</h1>
            <a href="https://github.com/DSoaresD">
              <div className="dsfilm-contact-container">
              <GithubIcon />
              <p className="dsfilm-contact-link">/Propietario</p>
              </div>
            </a>
          </div>
        </nav>
      </header>
    );
}

export default Navbar;