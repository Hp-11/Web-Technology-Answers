import './App.css';
import Head from './attach/header';
import Footer from './attach/footer';
import SingleMessages from './singleMessageTemplete';
function App() {
  return (
    <div className="App">
      <Head />
      <div>
      <div class="maincontainer container">
                <div class="feed">
                   <SingleMessages  />      
                </div>
                <div className="profileCard">

                </div>
                <div className="chatWindow">

                </div>

            </div>
        </div>
      <Footer />
    </div>
    
  );
}

export default App;
