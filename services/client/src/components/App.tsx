import * as React from "react";

export class App extends React.Component<any, any> {
  constructor(props: {}) {
    super(props);

    this.state = {
      recipe: "",
    }
  }

  componentDidMount() {
    fetch('grublub/webapi/init')
      .then(response => response.text())
      .then(recipe => this.setState({ recipe }));
  }

  public render(): JSX.Element {
    console.log(this.state);

    return <div>
      <h1>Recipes</h1>
      <ul>
        <li>{this.state.recipe}</li>
      </ul>
    </div>
  }
}
