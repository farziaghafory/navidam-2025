type Props = {
    text: string;
    tamano: 'sm' | 'md' | 'lg' | 'xl';
    color: 'red' | 'white' | 'danger';
    onClick?: () => void;
}


export function Boton({ text, tamano, color, onClick }: Props) {

    const tipoColor = {
        red: 'bg-red-600 text-white font-extrabold hover:bg-red-700',
        white: 'bg-slate-900 text-white font-semibold hover:bg-slate-800',
        danger: 'bg-red-600 hover:bg-red-700 text-white',
    }

    const tipoTamano = {
        sm: 'px-3 py-1.5 text-sm',
        md: 'px-4 py-2 text-base',
        lg: 'px-5 py-3 text-lg',
        xl: 'px-5 py-3 rounded-2xl text-base',
    }

    const clases = `${tipoTamano[tamano]} ${tipoColor[color]} transition-colors`;

    return (
        <button className={clases} onClick={onClick}>
            {text}
        </button>
    );
}